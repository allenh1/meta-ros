# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_roscpp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater nav-msgs roscpp std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_roscpp/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4bffdebae30bec7818d1c0b92ba9e73a"
SRC_URI[sha256sum] = "b2cfaddd2c430842da84c0c86dfbddd012b5626660a3e968f400c9eeb2da61c6"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_roscpp-2.0.0-0"

inherit catkin
