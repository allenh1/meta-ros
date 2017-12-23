# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cost maps, following the style of ethz-asl's grid_map library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cost-map-core cost-map-msgs costmap-2d ecl-build ecl-command-line ecl-console grid-map-core grid-map-costmap-2d grid-map-ros grid-map-visualization libopencv-dev nav-msgs roslib yaml-cpp"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map_ros/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b478510ecf1db5a654a699ff6fe8cd2b"
SRC_URI[sha256sum] = "d65b3c1561fd005e02b1ff01cecc2b23db663805a383fb5194b65968171c25a1"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map_ros-0.3.2-0"

inherit catkin
