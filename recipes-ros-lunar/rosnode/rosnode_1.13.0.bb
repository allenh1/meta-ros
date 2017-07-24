# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosnode is a command-line tool for displaying debug information     about ROS , "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native rosgraph rostest rostopic"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosnode/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf05ecd03cea7cfca57af63aa013368d"
SRC_URI[sha256sum] = "f5377fa5efa72be124e8a462c15f51ee551f611ee5474b5d1a5fe28a767b5b23"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosnode-1.13.0-0"

inherit catkin
