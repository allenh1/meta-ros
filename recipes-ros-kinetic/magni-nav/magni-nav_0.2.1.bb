# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The magni_nav package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native fiducials move-basic navigation"
SRC_URI = "https://github.com/UbiquityRobotics-release/magni_robot-release/archive/release/kinetic/magni_nav/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bdf5a7fbde18bcaa88ea36f27ea71cf5"
SRC_URI[sha256sum] = "017fddb1496c1dcbff16b2488f58296fb76b2ae81bb959de4c8c28b0f0254dbe"
S = "${WORKDIR}/magni_robot-release-release-kinetic-magni_nav-0.2.1-0"

inherit catkin
