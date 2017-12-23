# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stream cartesian commands"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/davetcoleman/cartesian_msgs-release/archive/release/lunar/cartesian_msgs/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b9a2c088b419a9226d7bd8fa128d752d"
SRC_URI[sha256sum] = "af847e20e8951dfbac31ba73a2ed425c1c36791cd0ac83a8e89a3e78b76f36ae"
S = "${WORKDIR}/cartesian_msgs-release-release-lunar-cartesian_msgs-0.0.3-0"

inherit catkin
