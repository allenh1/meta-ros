# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Helper functions for displaying and debugging MoveIt! data in Rviz via published"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen-conversions geometry-msgs graph-msgs moveit-core moveit-ros-robot-interaction roscpp roslint rviz-visual-tools std-msgs tf-conversions trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/davetcoleman/moveit_visual_tools-release/archive/release/kinetic/moveit_visual_tools/3.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0287335c9135bd40827fc181acf72a51"
SRC_URI[sha256sum] = "47a0be8e7037445e2ac82a7ec6025d7a861bad522a0058bc2afb63bd70cdc2f4"
S = "${WORKDIR}/moveit_visual_tools-release-release-kinetic-moveit_visual_tools-3.3.0-0"

inherit catkin
