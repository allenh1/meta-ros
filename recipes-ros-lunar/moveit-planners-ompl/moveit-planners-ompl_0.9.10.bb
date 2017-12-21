# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MoveIt interface to OMPL"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure eigen-conversions moveit-core moveit-ros-planning ompl pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners_ompl/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4294641ba72d25125f675536d683762d"
SRC_URI[sha256sum] = "4645b7896cf708b5af702130027407992c3b4492a34bb553270650037bcda6ec"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_planners_ompl-0.9.10-0"

inherit catkin
