# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of plugins for displaying occupancy information decoded from binary octoma"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native octomap octomap-msgs roscpp rviz"
SRC_URI = "https://github.com/ros-gbp/octomap_rviz_plugins-release/archive/release/kinetic/octomap_rviz_plugins/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa2db47d056b7e97d1a1c9882ca3357c"
SRC_URI[sha256sum] = "72f811c29603254838cd28a71a97c4ccc029ac5e046e121e662274a9e7519e5d"
S = "${WORKDIR}/octomap_rviz_plugins-release-release-kinetic-octomap_rviz_plugins-0.2.0-0"

inherit catkin
