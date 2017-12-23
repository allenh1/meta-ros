# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso_ros_control package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native controller-manager hardware-interface joint-limits-interface joint-state-controller joint-trajectory-controller kdl-parser position-controllers roscpp transmission-interface urdf"
SRC_URI = "https://github.com/start-jsk/denso-release/archive/release/kinetic/denso_ros_control/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65e587a8c16f5649ec0766f2f76e46d7"
SRC_URI[sha256sum] = "83e65ac7ef2769d2e0522b281e3637373597d73d30014d9fbb0a18a7a001fad6"
S = "${WORKDIR}/denso-release-release-kinetic-denso_ros_control-2.0.2-0"

inherit catkin
