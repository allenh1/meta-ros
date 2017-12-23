# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demonstrations for cost maps."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cost-map-ros cost-map-visualisations costmap-2d ecl-build ecl-console nav-msgs roscpp rviz tf"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map_demos/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a46c792946e5dffc072d95cd4fc9cb5"
SRC_URI[sha256sum] = "2b0bb21b534783017d7e4b6639715892def918d4c26deb69ad67509faceaa792"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map_demos-0.3.2-0"

inherit catkin
