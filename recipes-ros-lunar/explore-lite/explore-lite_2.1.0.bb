# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lightweight frontier-based exploration."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin costmap-2d geometry-msgs map-msgs move-base-msgs nav-msgs roscpp std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/hrnr/m-explore-release/archive/release/lunar/explore_lite/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d22b97d1415cd31a1ec56c800176facc"
SRC_URI[sha256sum] = "8281103e9e55bc998b4fe1cfeb92e1b5f5e4b7afdf4d11a03b1a8d14b3d42c9a"
S = "${WORKDIR}/m-explore-release-release-lunar-explore_lite-2.1.0-0"

inherit catkin
