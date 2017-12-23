# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2083b10e94a68720c4ec50ccda4f5b0d"
SRC_URI[sha256sum] = "6df7316b4a9490dc21d7566a5c935eaf5cb09836b77534817cb3f6d49186d3e9"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_msgs-0.5.16-0"

inherit catkin
