# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by rocon devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rocon-std-msgs std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_device_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2eab6139abbff49da55829dcedb5f459"
SRC_URI[sha256sum] = "031ce1fa94439aed61539c95b28b5f5858d05c678e9820be8708f75187979356"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_device_msgs-0.9.0-1"

inherit catkin
