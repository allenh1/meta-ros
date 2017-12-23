# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Although the package name might indicate that it only could only contain generic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native checkerboard-detector control-msgs denso-ros-control vs060-moveit-config"
SRC_URI = "https://github.com/start-jsk/denso-release/archive/release/kinetic/denso_launch/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83777d9c4c408a774d76ab7f6b71da2d"
SRC_URI[sha256sum] = "7f43012ba44b78c1608fdc4a2d76a3f44a1e795fc6271c85e4610195cff7bcec"
S = "${WORKDIR}/denso-release-release-kinetic-denso_launch-2.0.2-0"

inherit catkin
