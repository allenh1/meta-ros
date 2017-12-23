# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_imu_attitude_to_tf is a lightweight node that can be used to publish the "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native roscpp tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_imu_attitude_to_tf/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "889fc235cd238552b1d034756f2e242e"
SRC_URI[sha256sum] = "8e463d6db92e2729909345d6a45f2607d455fe0e45f02108a64eb77776c1c9be"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_imu_attitude_to_tf-0.3.5-0"

inherit catkin
