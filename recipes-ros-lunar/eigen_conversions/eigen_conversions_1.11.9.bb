# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversion functions between:
      - Eigen and KDL
      - Eigen and geometry_m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=840b6dcf32c32fa11f04aa14749f700f"

DEPENDS = "catkin cmake_modules eigen geometry_msgs orocos_kdl std_msgs"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/eigen_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eeb7ed6914f33c0d55f3ef8c8cc96b31"
SRC_URI[sha256sum] = "54df48e20601db8b369c7bcbefa4e914d8db04675851a4eb80ec01101691e566"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
