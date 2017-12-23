# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic ROS support for the Velodyne 3D LIDARs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native velodyne-driver velodyne-laserscan velodyne-msgs velodyne-pointcloud"
SRC_URI = "https://github.com/ros-drivers-gbp/${PN}-release/archive/release/kinetic/${PN}/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a63f459428cdc17e9a040d9c8430b7d"
SRC_URI[sha256sum] = "b0fa486c62601fe5736c96aee20780d90a81ebc411ab4313ad832282d819eaee"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.3.0-0"

inherit catkin
