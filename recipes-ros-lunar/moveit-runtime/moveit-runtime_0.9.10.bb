# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "moveit_runtime meta package contains MoveIt! packages that are essential for its"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-planners moveit-plugins moveit-ros-manipulation moveit-ros-move-group moveit-ros-perception moveit-ros-planning moveit-ros-planning-interface moveit-ros-warehouse"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_runtime/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1173bbadd3ea3d447594f9a7ff7d0677"
SRC_URI[sha256sum] = "68bff1a5c3b9643cf592338ddc7a7819d13d4564f79a3c93451aa774fa6c6c28"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_runtime-0.9.10-0"

inherit catkin
