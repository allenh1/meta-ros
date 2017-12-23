# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_imu_tools provides some tools for processing IMU messages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_imu_tools/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e48488d52d68a79705fc3ada1519c0d8"
SRC_URI[sha256sum] = "67037b2346efc376674ddf7d4a4e7aa8d92353544c485facf61d272ef4900337"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_imu_tools-0.3.5-0"

inherit catkin
