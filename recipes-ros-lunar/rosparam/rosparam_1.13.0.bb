# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosparam contains the rosparam command-line tool for getting and     setting ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native python-pyyaml rosgraph catkin-native"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosparam/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f77c6f0ab9620a7c1b643984cabee145"
SRC_URI[sha256sum] = "52fefe8f6c60bfadf4e9eec7a7eca6d0732f80ca4dc0b80692419a33e22730c2"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosparam-1.13.0-0"

inherit catkin
