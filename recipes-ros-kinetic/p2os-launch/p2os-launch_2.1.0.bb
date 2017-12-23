# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch and config files designed for use with the p2os stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native p2os-driver p2os-msgs p2os-teleop p2os-urdf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/kinetic/p2os_launch/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98d6c39a96238c2dc0bc15931d4ddcfc"
SRC_URI[sha256sum] = "ec50d96f2ce3bcb87ece34f9db483d72e10f4cd7384faa4fa88ab9750793a3ca"
S = "${WORKDIR}/p2os-release-release-kinetic-p2os_launch-2.1.0-0"

inherit catkin
