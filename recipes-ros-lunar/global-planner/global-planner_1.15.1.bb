# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A path planner library and node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native costmap-2d dynamic-reconfigure geometry-msgs nav-core nav-msgs navfn pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/global_planner/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4444394ded31cc5bb481a7b976163a9"
SRC_URI[sha256sum] = "b405a3a42b5365336d76715efe4bf17b0f033aabed6bc820490df6c0af07cc1f"
S = "${WORKDIR}/navigation-release-release-lunar-global_planner-1.15.1-0"

inherit catkin
