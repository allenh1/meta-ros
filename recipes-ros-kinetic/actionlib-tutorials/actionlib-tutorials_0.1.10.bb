# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The actionlib_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/kinetic/actionlib_tutorials/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c71011771e2192db53582f422864bda7"
SRC_URI[sha256sum] = "a6427b547fe2c4e026fc4dc52b7ed53c4d21a104cd5c9839274022385540c835"
S = "${WORKDIR}/common_tutorials-release-release-kinetic-actionlib_tutorials-0.1.10-0"

inherit catkin
