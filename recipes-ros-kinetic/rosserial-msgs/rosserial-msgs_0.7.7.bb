# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for automatic topic configuration using rosserial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_msgs/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9a8e0e1441cfca0013829e5ad41d526"
SRC_URI[sha256sum] = "0f730c31d4406ede1751d3c4ec400ebd6a287e0527eeecf1746a092ba0ac36dd"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_msgs-0.7.7-0"

inherit catkin
