# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_msgs-release/archive/release/kinetic/kobuki_msgs/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5eb86d592a3a52c69bbd1f396de8d211"
SRC_URI[sha256sum] = "d30bdabaabe6ae1160886604d498d8cb1b25848b5caa1130c4ee6cccf0e36dcc"
S = "${WORKDIR}/kobuki_msgs-release-release-kinetic-kobuki_msgs-0.7.0-0"

inherit catkin
