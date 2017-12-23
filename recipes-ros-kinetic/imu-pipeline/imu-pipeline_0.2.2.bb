# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "imu_pipeline"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native imu-processors imu-transformer"
SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/kinetic/imu_pipeline/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e36bbb3dcde8ed018b581d6bf2786ec0"
SRC_URI[sha256sum] = "da00fadae108012d4c03da250fd5e58240937d494b313395ef2f242580532f8b"
S = "${WORKDIR}/imu_pipeline-release-release-kinetic-imu_pipeline-0.2.2-0"

inherit catkin
