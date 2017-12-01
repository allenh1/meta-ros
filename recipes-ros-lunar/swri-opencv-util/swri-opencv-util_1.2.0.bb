# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_opencv_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_opencv_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d01c3af188cc9a872d372ea0355893d9"
SRC_URI[sha256sum] = "57a641e1489df10666b837540595e291aa8083b87a5e9abdcbe503f530dab03c"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_opencv_util-1.2.0-0"

inherit catkin
