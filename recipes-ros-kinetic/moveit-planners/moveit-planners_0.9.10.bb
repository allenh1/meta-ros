# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapacakge that installs all available planners for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-planners-ompl"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_planners/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c9743b1cd021af61852392a6fa3a4a4"
SRC_URI[sha256sum] = "ddc5ea8c816bbe80b413e80ec466b696ee10f84fb187ab63849198c7630f6f3c"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_planners-0.9.10-0"

inherit catkin
