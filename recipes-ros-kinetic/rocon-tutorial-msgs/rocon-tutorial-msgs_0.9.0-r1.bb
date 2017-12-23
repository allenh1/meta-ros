# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by rocon tutorials."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rocon-service-pair-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_tutorial_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "642948b7d7cb274d54d24cedd419ba2d"
SRC_URI[sha256sum] = "59acd2d2c212159596c47e7fb6703b19c97446c3c105b08ab7f541f999008b8d"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_tutorial_msgs-0.9.0-1"

inherit catkin
