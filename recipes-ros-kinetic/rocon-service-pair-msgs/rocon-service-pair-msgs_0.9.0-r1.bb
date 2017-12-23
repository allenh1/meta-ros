# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Paired pubsubs generators for non-blocking services."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rospy uuid-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_service_pair_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7825a371ccbed0898ac1d077b609113"
SRC_URI[sha256sum] = "8e43ccdea25c6f671cc8e33a5ef6b30438bc470676d39b36a043dd9c3a8ce67c"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_service_pair_msgs-0.9.0-1"

inherit catkin
