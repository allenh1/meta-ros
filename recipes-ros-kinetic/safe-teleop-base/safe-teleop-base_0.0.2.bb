# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides automatic collision avoidance and is intended to be used f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner catkin-native costmap-2d pcl roscpp"
SRC_URI = "https://github.com/ros-gbp/shared_autonomy_manipulation-release/archive/release/kinetic/safe_teleop_base/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f41be85acd39cea63f92c05917492672"
SRC_URI[sha256sum] = "3d166a7bafab0cb5ccb1226b82b6f2fe4b65bfdfc68f4a90000f293531c7f046"
S = "${WORKDIR}/shared_autonomy_manipulation-release-release-kinetic-safe_teleop_base-0.0.2-0"

inherit catkin
