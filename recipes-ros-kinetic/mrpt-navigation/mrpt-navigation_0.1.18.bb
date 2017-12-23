# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools related to the Mobile Robot Programming Toolkit (MRPT).     Refer to http:"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native mrpt-bridge mrpt-local-obstacles mrpt-localization mrpt-map mrpt-msgs mrpt-rawlog mrpt-reactivenav2d mrpt-tutorials"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_navigation/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "593174f576d22f41dab9d867e22cbca7"
SRC_URI[sha256sum] = "f8c0cadd8296a2ba53b962b5d8ce04f7b56bd7b760edbe9a00fd53c3a84c46ee"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_navigation-0.1.18-0"

inherit catkin
