# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The OSG Ocean library adapted to UWSim. See https://code.google.com/p/osgocean"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake libfftw3 libopenscenegraph opengl"
SRC_URI = "https://github.com/uji-ros-pkg/uwsim_osgocean-release/archive/release/kinetic/uwsim_osgocean/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66ae162595e0f82ca1d0e200e44912eb"
SRC_URI[sha256sum] = "3c990411b0b339b4072b45f71e1c6669cb188914e9366428b024edbf6f83b579"
S = "${WORKDIR}/uwsim_osgocean-release-release-kinetic-uwsim_osgocean-1.0.3-0"

inherit catkin
