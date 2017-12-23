# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teb_local_planner_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl catkin-native map-server move-base stage-ros teb-local-planner"
SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner_tutorials-release/archive/release/kinetic/teb_local_planner_tutorials/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e88df144a6b3734d29eabce805f545e7"
SRC_URI[sha256sum] = "6859eb5996413da3fa2b6266bacfaf2337adfb51d56699442e8ae33332cd1b05"
S = "${WORKDIR}/teb_local_planner_tutorials-release-release-kinetic-teb_local_planner_tutorials-0.2.1-0"

inherit catkin
