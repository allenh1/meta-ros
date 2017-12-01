# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Geographic information metapackage.      Not needed for wet packages, use only t"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geodesy geographic-msgs"
SRC_URI = "https://github.com/ros-${PN}/geographic_info-release/archive/release/lunar/geographic_info/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc04dab26246446ec91ea1569d76b6f2"
SRC_URI[sha256sum] = "b408c2d9fcd3d88c5e9bd89e903fbb1fcc6aa9bc92b441a2b3845bbcc26948c0"
S = "${WORKDIR}/geographic_info-release-release-lunar-geographic_info-0.5.2-0"

inherit catkin
