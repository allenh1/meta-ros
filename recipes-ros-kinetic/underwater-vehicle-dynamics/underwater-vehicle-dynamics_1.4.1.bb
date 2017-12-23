# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An underwater dynamics module"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nav-msgs rospy sensor-msgs std-msgs tf tf-conversions"
SRC_URI = "https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/kinetic/underwater_vehicle_dynamics/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84eac90fbb6c08050ccd96ad9b61ac12"
SRC_URI[sha256sum] = "c3e67287546f4b12d9c43ca682b5e78243218614d98939a14cdcf88b0cfb80b1"
S = "${WORKDIR}/underwater_simulation-release-release-kinetic-underwater_vehicle_dynamics-1.4.1-0"

inherit catkin
