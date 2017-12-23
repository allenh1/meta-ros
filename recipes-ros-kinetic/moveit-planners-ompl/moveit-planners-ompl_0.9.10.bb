# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MoveIt interface to OMPL"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure eigen-conversions moveit-core moveit-ros-planning ompl pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_planners_ompl/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b39758e0d9db94bdc44e8f74f061a966"
SRC_URI[sha256sum] = "47e57809cbab4b91e1b82abde2a4dec5d80bb57562dae4d7dce64efd73536570"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_planners_ompl-0.9.10-0"

inherit catkin
