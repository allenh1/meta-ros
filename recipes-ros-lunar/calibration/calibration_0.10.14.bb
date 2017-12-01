# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a toolchain running through the robot calibration process. This      in"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-estimation calibration-launch calibration-msgs catkin-native image-cb-detector interval-intersection joint-states-settler laser-cb-detector monocam-settler settlerlib"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab3383e76efe479815b8a187616719e4"
SRC_URI[sha256sum] = "dd4d3689af6a930c940abe1debb9ee48d721c8ffe783f5cb1deddd45388087bb"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.10.14-0"

inherit catkin
