# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for Microstrain 3DM-GX4-25 IMU     This package is modified by robotis.  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fc216ef9336537897fbeafa564601763"

DEPENDS = "catkin-native diagnostic-updater geometry-msgs message-generation message-runtime roscpp sensor-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/thormang3_imu_3dm_gx4/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d9da2813c9cf8e9bcecfb76e470c8c7"
SRC_URI[sha256sum] = "a296a897d8080d6ced6949b563ccfb54d3fcf931b18d2b990e6449e11bf104a7"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-thormang3_imu_3dm_gx4-0.1.3-0"

inherit catkin
