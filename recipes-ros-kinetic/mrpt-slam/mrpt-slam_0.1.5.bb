# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mrpt_slam"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native mrpt-ekf-slam-2d mrpt-ekf-slam-3d mrpt-icp-slam-2d mrpt-rbpf-slam"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/kinetic/mrpt_slam/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a780c85f7fae83261bb5567244aea8e"
SRC_URI[sha256sum] = "427a4277b82fcc8c5428a2e59d0a8e339824a2e805874079ba87f5722b117177"
S = "${WORKDIR}/mrpt_slam-release-release-kinetic-mrpt_slam-0.1.5-0"

inherit catkin
