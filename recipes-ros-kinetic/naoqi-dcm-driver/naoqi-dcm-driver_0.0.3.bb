# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing the hardware interface to connect to Nao, Romeo, or Pepper ro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diagnostic-msgs diagnostic-updater geometry-msgs hardware-interface naoqi-libqi naoqi-libqicore roscpp rospy sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-naoqi/naoqi_dcm_driver-release/archive/release/kinetic/naoqi_dcm_driver/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d61b050af47ebece7ab7ea72f8e8b73c"
SRC_URI[sha256sum] = "13405c7e5c550b8aadbf595d9c5694a4368a28185063264e3d5bf2e559502cba"
S = "${WORKDIR}/naoqi_dcm_driver-release-release-kinetic-naoqi_dcm_driver-0.0.3-0"

inherit catkin
