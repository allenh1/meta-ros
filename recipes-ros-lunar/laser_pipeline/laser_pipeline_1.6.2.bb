# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package of libraries for processing laser data, including converting laser "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin laser_assembler laser_filters laser_geometry"
SRC_URI = "https://github.com/ros-gbp/laser_pipeline-release/archive/release/lunar/laser_pipeline/1.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "989e7dfcea382883247283663fdaa42a"
SRC_URI[sha256sum] = "f8e5d71fd3177aed50f97954534bfabec587eeb39bf13e8acc5cf01827c6c222"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
