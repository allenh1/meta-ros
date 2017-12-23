# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Trep: Mechanical Simulation and Optimal Control Software"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native glut python python-imaging python-matplotlib python-numpy python-opengl python-qt-bindings python-qt-bindings-gl python-scipy rospy sensor-msgs tf"
SRC_URI = "https://github.com/MurpheyLab/trep-release/archive/release/kinetic/python_trep/1.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84a2b8f31781a549c98a91028894bc4d"
SRC_URI[sha256sum] = "8b4fdb09a82cba7b0f1ca40d6d4790b2c0d09fd7002d2d1cba01078196ce7b5d"
S = "${WORKDIR}/trep-release-release-kinetic-python_trep-1.0.3-1"

inherit catkin
