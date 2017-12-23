# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecto bindings for common PCL functionality."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native ecto pcl-conversions proj sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/ecto_pcl-release/archive/release/kinetic/ecto_pcl/0.4.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "50112d0c379c1ef37e4817314ffea3ca"
SRC_URI[sha256sum] = "2691d2245038c7a7c396b770a090096c80c2734b33318f2ec80b4d823a1b6553"
S = "${WORKDIR}/ecto_pcl-release-release-kinetic-ecto_pcl-0.4.5-0"

inherit catkin
