# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "eband_local_planner implements a plugin to the     base_local_planner. It implem"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner catkin-native cmake-modules control-toolbox costmap-2d geometry-msgs nav-core nav-msgs pluginlib roscpp tf tf-conversions"
SRC_URI = "https://github.com/utexas-bwi-gbp/eband_local_planner-release/archive/release/kinetic/eband_local_planner/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d43addfbee58ad0567e238b2a00d3686"
SRC_URI[sha256sum] = "28af2a7ee8fa4ef4b4bf938fd8314d9ccd334315caf5aa6eccc492230a0a3fe6"
S = "${WORKDIR}/eband_local_planner-release-release-kinetic-eband_local_planner-0.3.1-0"

inherit catkin
