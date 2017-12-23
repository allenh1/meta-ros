# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of filtering tools for tracking people's locations"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bfl catkin-native geometry-msgs message-filters people-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/kinetic/people_tracking_filter/1.0.10-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "77fce64477df010cb130228701b583c5"
SRC_URI[sha256sum] = "e2ab78e110c4c4e8dc2d5fe6a33f8a19a536cc8eafcc7ba0bace008b0e11e692"
S = "${WORKDIR}/people-release-release-kinetic-people_tracking_filter-1.0.10-1"

inherit catkin
