# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package of libraries for processing laser data, including converting laser "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native laser-assembler laser-filters laser-geometry"
SRC_URI = "https://github.com/ros-gbp/laser_pipeline-release/archive/release/kinetic/laser_pipeline/1.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d64bba578225ec73626e991305ba7c96"
SRC_URI[sha256sum] = "decd2bc097e44f066dbe20da9a6228683481a146f95258c9f4d91e6a15c2fe66"
S = "${WORKDIR}/laser_pipeline-release-release-kinetic-laser_pipeline-1.6.2-0"

inherit catkin
