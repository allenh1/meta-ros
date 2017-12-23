# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_lookat_action"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs boost catkin-native control-msgs geometry-msgs kdl-conversions kdl-parser message-generation message-runtime orocos-kdl roscpp rospy tf tf-conversions trajectory-msgs"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_lookat_action/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10e80cd23f7f98c8779a0a7eb06d8a90"
SRC_URI[sha256sum] = "16329d81ee4fce808b744ae0709036e8e8ceec51f75edf511f725c61b698d593"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_lookat_action-0.7.0-0"

inherit catkin
