# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for moveit plugins."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-fake-controller-manager moveit-ros-control-interface moveit-simple-controller-manager"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_plugins/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09f2402631ab40a97fed2cee370e8629"
SRC_URI[sha256sum] = "596913969166f307b3a8b50d20cfbc1108e3c5f9960e3efd0eafce458c0af093"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_plugins-0.9.10-0"

inherit catkin
