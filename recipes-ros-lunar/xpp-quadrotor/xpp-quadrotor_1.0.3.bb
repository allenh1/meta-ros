# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The URDF file for a quadrotor to be used with the xpp packages and a      simple"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin roscpp xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp_quadrotor/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2227fde62d4859fff5c78b47e310db41"
SRC_URI[sha256sum] = "8dc4a602fd04aa0d00a1d50e4bd89f9910255f3d2c483294f41d58d4c7766444"
S = "${WORKDIR}/xpp-release-release-lunar-xpp_quadrotor-1.0.3-0"

inherit catkin
