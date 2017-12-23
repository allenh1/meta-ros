# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "moveit_runtime meta package contains MoveIt! packages that are essential for its"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-planners moveit-plugins moveit-ros-manipulation moveit-ros-move-group moveit-ros-perception moveit-ros-planning moveit-ros-planning-interface moveit-ros-warehouse"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_runtime/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23682ebd30a7a20aa55f563e1a2c2902"
SRC_URI[sha256sum] = "9d7b727908ddf678581fc8298e2ca2bbbf5fde2aada90ce63904c1434a4bd7cf"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_runtime-0.9.9-0"

inherit catkin
