# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Filters the robot's body out of point clouds."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp assimp-dev bullet catkin-native filters pcl-ros resource-retriever roscpp sensor-msgs tf urdf visualization-msgs"
SRC_URI = "https://github.com/pr2-gbp/robot_self_filter-gbp/archive/release/kinetic/robot_self_filter/0.1.30-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5d66576fcbfd55b605c0f05aacc8578"
SRC_URI[sha256sum] = "4e815965799f845bee8d0af7d676c260bfae60ef2a4e4902361d753cefb92c6f"
S = "${WORKDIR}/robot_self_filter-gbp-release-kinetic-robot_self_filter-0.1.30-1"

inherit catkin
