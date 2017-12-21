# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for moveit plugins."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-fake-controller-manager moveit-ros-control-interface moveit-simple-controller-manager"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_plugins/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de7628a742e6104ed14d53e4063c4959"
SRC_URI[sha256sum] = "6ffcc1a48e96d7564302e1ceafd29c15c2fffe9e3020f159fb89bc9df947fba8"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_plugins-0.9.10-0"

inherit catkin
