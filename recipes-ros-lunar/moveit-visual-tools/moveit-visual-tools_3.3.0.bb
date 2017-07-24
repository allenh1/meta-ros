# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Helper functions for displaying and debugging MoveIt! data in Rviz via published"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native cmake-modules eigen-conversions geometry-msgs graph-msgs moveit-core moveit-ros-robot-interaction roscpp roslint rviz-visual-tools std-msgs tf-conversions trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/davetcoleman/moveit_visual_tools-release/archive/release/lunar/moveit_visual_tools/3.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "846c07f69c5fc206670c0361ff212332"
SRC_URI[sha256sum] = "92e377ec2867296230cb12276bcace5288a106c5034b59925a9e81933d876104"
S = "${WORKDIR}/moveit_visual_tools-release-release-lunar-moveit_visual_tools-3.3.0-0"

inherit catkin
