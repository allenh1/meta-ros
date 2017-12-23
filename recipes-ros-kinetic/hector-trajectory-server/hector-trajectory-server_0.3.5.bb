# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_trajectory_server keeps track of tf trajectories extracted from tf data a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native hector-map-tools hector-nav-msgs nav-msgs roscpp tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_trajectory_server/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "643e655d4c689815da44b30c5249536a"
SRC_URI[sha256sum] = "40fb3551ed7f6a9d88e58d08a504962274d439e05515f05ce7a69aebe43ef3c9"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_trajectory_server-0.3.5-0"

inherit catkin
